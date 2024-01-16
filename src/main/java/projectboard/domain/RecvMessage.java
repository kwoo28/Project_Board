package projectboard.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@NoArgsConstructor
public class RecvMessage {
    @ApiModelProperty(example = "쪽지 고유 번호")
    private Long id;
    @ApiModelProperty(example = "쪽지 보낸 유저 고유 번호")
    private Long sendUserId;
    @ApiModelProperty(example = "쪽지 받는 유저 고유 번호")
    private Long recvUserId;
    @ApiModelProperty(example = "쪽지 보낸 일자")
    private LocalDateTime sendAt;
    @ApiModelProperty(example = "쪽지 읽은 일자")
    private LocalDateTime receiveAt;
    @ApiModelProperty(example = "쪽지 제목")
    private String title;
    @ApiModelProperty(example = "쪽지 내용")
    private String content;

    @Builder
    public RecvMessage(Long sendUserId, Long recvUserId, LocalDateTime sendAt, LocalDateTime receiveAt, String title, String content) {
        this.sendUserId = sendUserId;
        this.recvUserId = recvUserId;
        this.sendAt = sendAt;
        this.receiveAt = receiveAt;
        this.title = title;
        this.content = content;
    }
}