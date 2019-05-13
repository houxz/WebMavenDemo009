package com.projectmanage.dao;

import com.projectmanage.pojo.AuthorityModel;

public interface AuthorityModelDao {

	AuthorityModel getAuthorityByUsername(String username);
}
