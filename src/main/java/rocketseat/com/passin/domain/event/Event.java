// domain hospedará as classes da nossa aplicação

package rocketseat.com.passin.domain.event;

// jakarta: plataforma de dev é uma plataforma de desenvolvimento
import jakarta.persistence.*;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
}
