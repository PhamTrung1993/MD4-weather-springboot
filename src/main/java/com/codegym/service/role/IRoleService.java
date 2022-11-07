package com.codegym.service.role;

import com.codegym.model.AppRole;
import com.codegym.service.IGeneralService;

public interface IRoleService extends IGeneralService<AppRole> {
    AppRole findByName(String name);
}
