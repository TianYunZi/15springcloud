package test.practise.org.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import test.practise.org.enums.OrganizationType;
import test.practise.org.vo.OrganizationVO;

@Service
public class TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private Environment environment;

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "organizationIsCarrierFallback")
    public Boolean organizationIsCarrier(String carrierId) {
        String url = environment.getProperty("uaa.queryOrganizationById.url").concat(carrierId).concat("/internal");
        OrganizationVO organizationVO = restTemplate.getForEntity(url, OrganizationVO.class).getBody();
        LOGGER.info("查询到的OrganizationVO对象信息: {}", organizationVO);
        return organizationVO != null && organizationVO.getOrganizationType() == OrganizationType.CARRIER;
    }

    public Boolean organizationIsCarrierFallback(String carrierId) {
        throw new RuntimeException("调用uaa的/api/v1/organizations/" + carrierId + "/internal api超时");
    }
}
