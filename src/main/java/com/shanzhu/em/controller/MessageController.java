package com.shanzhu.em.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shanzhu.em.entity.Message;
import com.shanzhu.em.service.MessageService;
import com.shanzhu.em.utils.ApiResultHandler;
import com.shanzhu.em.utils.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 留言 控制层
 *
 * @author: Wyx18373256
 * @date: 2022-02-20
 */
@RestController
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    /**
     * 留言查询 分页
     *
     * @param page 分页页数
     * @param size 分页大小
     * @return 留言数据
     */
    @GetMapping("/messages/{goodId}/{page}/{size}")
    public R<IPage<Message>> findAll(@PathVariable("goodId") Long goodId, @PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        Page<Message> messagePage = new Page<>(page, size);
        IPage<Message> all = messageService.findPage(messagePage, goodId);
        return ApiResultHandler.buildApiResult(200, "查询所有留言", all);
    }

    /**
     * 通过id查询留言
     *
     * @param id 留言id
     * @return 留言内容
     */
    @GetMapping("/message/{id}")
    public R<Message> findById(@PathVariable("id") Integer id) {
        Message res = messageService.findById(id);
        return ApiResultHandler.buildApiResult(200, "根据Id查询", res);
    }

    /**
     * 删除留言
     *
     * @param id 留言id
     * @return 删除成功数量
     */
    @DeleteMapping("/message/{id}")
    public Integer delete(@PathVariable("id") Integer id) {
        return messageService.delete(id);
    }

    /**
     * 添加留言
     *
     * @param message 留言信息
     * @return 结果
     */
    @PostMapping("/message")
    public R<Integer> add(@RequestBody Message message) {
        Integer res = messageService.add(message);
        if (res == 0) {
            return ApiResultHandler.buildApiResult(400, "添加失败", res);
        } else {
            return ApiResultHandler.buildApiResult(200, "添加成功", res);
        }
    }

}
