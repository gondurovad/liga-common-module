package liga.medical.common.dto;

import lombok.Data;

@Data
public class RabbitMessageDTO {
    
    private long id;

    private MessageType type;

    private String description;
}
