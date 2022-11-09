package liga.medical.commonmodule.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("debug")
@NoArgsConstructor
@Data
public class Debug {

    @Id
    private long uuid;

    @Column("system_type_id")
    private long systemTypeId;

    @Column("method_params")
    private String methodParams;

}
