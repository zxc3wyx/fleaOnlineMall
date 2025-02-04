package com.shanzhu.em.controller;

import com.shanzhu.em.common.R;
import com.shanzhu.em.utils.TokenUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色 控制层
 *
 * @author: Wyx18373256
 * @date: 2022-02-10
 */
@RestController
public class RoleController {

    /**
     * 查询当前用户角色
     *
     * @return 角色名
     */
    @PostMapping("/role")
    public R<String> getUserRole() {
        return R.success(TokenUtils.getCurrentUser().getRole());
    }

}
