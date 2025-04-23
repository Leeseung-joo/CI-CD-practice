package umc.study.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.MultiPolygon;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class EmdArea {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "geom", columnDefinition = "geometry(MultiPolygon,4326)", nullable = false)
    private MultiPolygon geom;

    @Column(name = "center", columnDefinition = "geometry(Point,4326)", nullable = false)
    private Point center;

    @Column(nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime version;
}
