package gov.saanjh.user.exception.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse{
    private Date timestamp;
    private String message;
    private String details;
}
