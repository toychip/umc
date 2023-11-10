package umc.week6.domain.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import umc.week6.domain.dto.request.ReviewCreateRequest;
import umc.week6.domain.dto.response.HomeResponse;
import umc.week6.domain.dto.response.ReviewListResponse;
import umc.week6.domain.service.HomeService;
import umc.week6.domain.service.ReviewService;


@RestController
@RequiredArgsConstructor
public class MvpController {

    // 간편한 미션 수행을 위해 jpa dependencies 활성화

    // 모든 기능은 로그인 후에 접근 할 수 있도록 가정
    private final HomeService homeService;
    private final ReviewService reviewService;

    // 홈 화면 스크롤
    @GetMapping("/home")
    public Page<HomeResponse> getHome(Pageable pageable) {
        return homeService.getHome(pageable);
    }

    // 리뷰 작성
    @PostMapping("/review")
    public void writeReview(@RequestBody ReviewCreateRequest request) {
        reviewService.writeReview(request);
    }

    // 리뷰 전체 조회
    // 제목, 내용, 작성자로 검색 가능 (각 요소들은 필수값이 아님)
    @GetMapping("/review")
    public Page<ReviewListResponse> getReviewList(
            Pageable pageable,
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String content,
            @RequestParam(required = false) String writer
    ) {
        return reviewService.getReviewList(pageable, title, content, writer);
    }

}
