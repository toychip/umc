package umc.week6.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import umc.week6.domain.dto.response.HomeResponse;

@Service
public class HomeService {
    public Page<HomeResponse> getHome(Pageable pageable) {
        return null;
    }

}
