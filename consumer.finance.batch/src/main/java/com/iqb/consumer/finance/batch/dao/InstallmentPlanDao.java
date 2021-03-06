/**
 * @Copyright (c) http://www.iqianbang.com/ All rights reserved.
 * @Description: TODO
 * @date 2016年7月13日 上午10:40:57
 * @version V1.0
 */

package com.iqb.consumer.finance.batch.dao;

import com.iqb.consumer.finance.batch.bean.InstallmentPlan;
import com.iqb.consumer.finance.batch.dao.basic.BaseDao;

/**
 * @author <a href="zhuyaoming@aliyun.com">yeoman</a>
 */
public interface InstallmentPlanDao extends BaseDao<InstallmentPlan> {

    /**
     * 通过ID查询计划
     * 
     * @param planId
     * @return
     */
    InstallmentPlan getByPlanId(long planId);
}
