package umc.week6.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.week6.domain.dto.response.HomeResponse;
import umc.week6.domain.service.HomeService;


@RestController
@RequiredArgsConstructor
public class MvpController {

    // 간편한 미션 수행을 위해 jpa dependencies 활성화

    // 모든 기능은 로그인 후에 접근 할 수 있도록 가정
    private final HomeService homeService;

    // 홈 화면 스크롤
    @GetMapping("/home")
    public Page<HomeResponse> getHome(Pageable pageable) {
        return homeService.getHome(pageable);
    }


}
