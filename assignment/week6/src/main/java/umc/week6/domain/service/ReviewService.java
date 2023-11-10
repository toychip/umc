package umc.week6.domain.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import umc.week6.domain.dto.request.ReviewCreateRequest;
import umc.week6.domain.dto.response.ReviewDetailResponse;
import umc.week6.domain.dto.response.ReviewListResponse;

@Service
public class ReviewService {
    public void writeReview(ReviewCreateRequest request) {
    }

    public Page<ReviewListResponse> getReviewList(Pageable pageable, String title, String content, String writer) {
        return null;
    }

    public ReviewDetailResponse getReviewDetail(Long reviewId) {
        return null;
    }

}
