package ee.veikosoomets.example.UserService;

import ee.veikosoomets.example.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {

    @Autowired
    private CampaignRepository campaignRepository;
}
