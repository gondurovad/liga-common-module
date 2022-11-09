package liga.medical.commonmodule.core.serviceImpl;

import liga.medical.common.dto.LogType;
import liga.medical.common.service.LoggingService;
import liga.medical.commonmodule.core.model.Debug;
import liga.medical.commonmodule.core.model.Exception;
import liga.medical.commonmodule.core.repository.DebugRepository;
import liga.medical.commonmodule.core.repository.ExceptionRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggingServiceImpl implements LoggingService {

    private final DebugRepository debugRepository;

    private final ExceptionRepository exceptionRepository;

    public LoggingServiceImpl(DebugRepository debugRepository, ExceptionRepository exceptionRepository) {
        this.debugRepository = debugRepository;
        this.exceptionRepository = exceptionRepository;
    }

    @Override
    public void logMessage(LogType logType, long systemTypeId, String methodParams) {
        switch (logType) {
            case DEBUG:
                Debug debug = new Debug();
                debug.setSystemTypeId(systemTypeId);
                debug.setMethodParams(methodParams);
                debugRepository.save(debug);
                log.info("DEBUG SystemTypeId: {}, MethodParams: {}", systemTypeId, methodParams);
                break;
            case EXCEPTION:
                Exception exception = new Exception();
                exception.setSystemTypeId(systemTypeId);
                exception.setMethodParams(methodParams);
                exceptionRepository.save(exception);
                log.info("EXCEPTION SystemTypeId: {}, MethodParams: {}", systemTypeId, methodParams);
                break;
            default:
                log.info("Attempt to log message for unknown reason. SystemTypeId: {}, MethodParams: {}", systemTypeId, methodParams);
        }
    }
}
