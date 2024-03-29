package projectboard.dto.post;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class UpdatePostDto {
    @NotNull(message = "제목을 입력해주세요.")
    private String title;
    @NotNull(message = "내용을 입력해주세요.")
    private String content;
}
