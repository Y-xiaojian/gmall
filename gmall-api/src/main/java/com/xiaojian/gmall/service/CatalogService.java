package com.xiaojian.gmall.service;

import com.xiaojian.gmall.bean.PmsBaseCatalog1;
import com.xiaojian.gmall.bean.PmsBaseCatalog2;
import com.xiaojian.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
