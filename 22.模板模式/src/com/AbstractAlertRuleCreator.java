package com;

/**
 * @Description:
 * @author: LinQin
 * @date: 2018/12/05
 */
public abstract class AbstractAlertRuleCreator implements AlertRuleInterface {
    @Override
    public String create() {
        // 公有部分
        String common = createCommonConfig();
        // 私有部分
        String ziji = createConfig();

        return common + ziji;
    }

    /**
     * 私有部分
     *
     * @return
     */
    protected abstract String createConfig();

    /**
     * 公有部分
     *
     * @return
     */
    private String createCommonConfig() {
        return "公共 ";
    }
}
