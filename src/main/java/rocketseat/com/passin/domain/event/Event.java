// domain hospedará as classes da nossa aplicação

package rocketseat.com.passin.domain.event;

// jakarta: plataforma de dev é uma plataforma de desenvolvimento
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "events")
@Getter //métodos da classe que permite que eu acesse as propriedades de outras classes
@Setter //atualiza o valor
@AllArgsConstructor //lombok: m argumento por campo final/não nulo ou um argumento para cada campo
@NoArgsConstructor //lombok: Gera construtores que não aceitam argumentos
public class Event {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String details;

    @Column(nullable = false, unique = true)
    private String slug;

    @Column(nullable = false, name = "maximum_attendees")
    private Integer maximumAttendees;

}
