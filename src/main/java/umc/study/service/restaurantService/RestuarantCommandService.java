package umc.study.service.restaurantService;

import umc.study.domain.Review;
import umc.study.web.request.ReviewRequestDTO;
import umc.study.web.response.ReviewResponseDTO;

public interface RestuarantCommandService {
    Review createReview(ReviewRequestDTO request, Long id);
}
