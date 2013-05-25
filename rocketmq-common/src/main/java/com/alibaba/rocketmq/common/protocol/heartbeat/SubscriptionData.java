/**
 * $Id: SubscriptionData.java 1835 2013-05-16 02:00:50Z shijia.wxr $
 */
package com.alibaba.rocketmq.common.protocol.heartbeat;

/**
 * @author shijia.wxr<vintage.wang@gmail.com>
 * 
 */
public class SubscriptionData {
    public final static String SUB_ALL = "*";
    private String topic;
    private String subString;
    private String subNumfmt;
    private boolean hasAndOperator;


    public SubscriptionData() {
    }


    public SubscriptionData(String topic, String subString, String subNumfmt, boolean hasAndOperator) {
        this.topic = topic;
        this.subString = subString;
        this.subNumfmt = subNumfmt;
        this.hasAndOperator = hasAndOperator;
    }


    public String getTopic() {
        return topic;
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }


    public String getSubString() {
        return subString;
    }


    public void setSubString(String subString) {
        this.subString = subString;
    }


    public String getSubNumfmt() {
        return subNumfmt;
    }


    public void setSubNumfmt(String subNumfmt) {
        this.subNumfmt = subNumfmt;
    }


    public boolean isHasAndOperator() {
        return hasAndOperator;
    }


    public void setHasAndOperator(boolean hasAndOperator) {
        this.hasAndOperator = hasAndOperator;
    }


    public static String getSubAll() {
        return SUB_ALL;
    }


    @Override
    public String toString() {
        return "SubscriptionData [topic=" + topic + ", subString=" + subString + ", subNumfmt=" + subNumfmt
                + ", hasAndOperator=" + hasAndOperator + "]";
    }
}
