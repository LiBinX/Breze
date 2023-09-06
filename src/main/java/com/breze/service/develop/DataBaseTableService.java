package com.breze.service.develop;

import com.breze.entity.pojo.develop.DataBaseTable;

import java.util.List;

/**
 * @Author LUCIFER-LGX
 * @Date 2022/8/24 10:11
 * @Copyright(c) 2022 , 青枫网络工作室
 * @Description 数据库表操作服务 update by tylt6688 2023/3/15
 */
public interface DataBaseTableService {

    List<String> showDataBases();

    List<DataBaseTable> listDataBaseTables(String dataBaseName);
}
