package com.tonine.mybrainempire.common.strategy;

import org.apache.logging.log4j.core.appender.rolling.RollingFileManager;
import org.apache.logging.log4j.core.appender.rolling.RolloverDescription;
import org.apache.logging.log4j.core.appender.rolling.RolloverStrategy;
import org.apache.logging.log4j.core.appender.rolling.action.Action;

/**
 * @author XiongYiGe
 * @date 2021/12/27
 * @description
 */
public class MyRollOverStrategy implements RolloverStrategy {
    /**
     * Prepare for a rollover.  This method is called prior to closing the active log file, performs any necessary
     * preliminary actions and describes actions needed after close of current log file.
     *
     * @param manager The RollingFileManager name for current active log file.
     * @return Description of pending rollover, may be null to indicate no rollover at this time.
     * @throws SecurityException if denied access to log files.
     */
    @Override
    public RolloverDescription rollover(RollingFileManager manager) throws SecurityException {
        return new RolloverDescription() {
            @Override
            public String getActiveFileName() {
                return null;
            }

            @Override
            public boolean getAppend() {
                return false;
            }

            @Override
            public Action getSynchronous() {
                return null;
            }

            @Override
            public Action getAsynchronous() {
                return null;
            }
        };
    }
}
