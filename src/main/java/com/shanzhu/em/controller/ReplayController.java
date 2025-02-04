package com.shanzhu.em.controller;

import com.shanzhu.em.entity.Replay;
import com.shanzhu.em.service.ReplayService;
import com.shanzhu.em.utils.ApiResultHandler;
import com.shanzhu.em.utils.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 回复 控制层
 *
 * @author: Wyx18373256
 * @date: 2022-02-20
 */
@RestController
@RequiredArgsConstructor
public class ReplayController {

    private final ReplayService replayService;

    /**
     * 添加回复
     *
     * @param replay 回复内容
     * @return 结果
     */
    @PostMapping("/replay")
    public R add(@RequestBody Replay replay) {
        int data = replayService.add(replay);
        if (data != 0) {
            return ApiResultHandler.buildApiResult(200, "添加成功！", data);
        } else {
            return ApiResultHandler.buildApiResult(400, "添加失败！", null);
        }
    }

    /**
     * 通过留言id查询回复
     *
     * @param messageId 留言id
     * @return 回复
     */
    @GetMapping("/replay/{messageId}")
    public R<List<Replay>> findAllById(@PathVariable("messageId") Integer messageId) {
        return ApiResultHandler.buildApiResult(200, "根据messageId查询", replayService.findAllById(messageId));
    }
}
