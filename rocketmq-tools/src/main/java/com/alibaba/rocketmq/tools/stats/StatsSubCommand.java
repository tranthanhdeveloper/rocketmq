package com.alibaba.rocketmq.tools.stats;

import com.alibaba.rocketmq.tools.SubCommand;


/**
 * @author shijia.wxr<vintage.wang@gmail.com>
 */
public class StatsSubCommand implements SubCommand {

    @Override
    public String commandName() {
        return "stats";
    }


    @Override
    public String commandDesc() {
        return "Print the stats of broker, producer or consumer";
    }


    @Override
    public void printHelp() {
    }


    @Override
    public void execute(String[] args) {
        // TODO Auto-generated method stub

    }
}
