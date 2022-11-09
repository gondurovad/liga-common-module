package liga.medical.common.service;

import liga.medical.common.dto.LogType;

public interface LoggingService {

    void logMessage(LogType logType, long systemTypeId, String methodParams);
}
