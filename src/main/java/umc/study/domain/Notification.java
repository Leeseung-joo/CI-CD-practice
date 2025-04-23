package umc.study.domain;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Notification {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private boolean isConfirmed;

    @Column(nullable = false)
    private String dtype;

    @Column(nullable = false)
    private String title;

    @Lob
    @Basic(fetch = FetchType.LAZY) //지연로딩 설정 안할 시에 일부 구현체에서는 즉시로딩되는 문제가 생길수 잇음
    @Column(columnDefinition = "TEXT", nullable = false)
    private String body;



}
