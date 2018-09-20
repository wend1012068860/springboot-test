package com.example.quickstart.dao;

import com.example.quickstart.entity.Avatar;
import com.example.quickstart.entity.Hot;
import com.example.quickstart.entity.Title;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@Data
public class TitleDAO {
    public List<Title> getTitle(){
        Title[] titles = {
                new Title("1.jpg","跑步好搭档","查看专题"),
                new Title("2.jpg","青年居家生活指南","查看专题"),
                new Title("3.jpg","你应该知道的PPT技巧","查看专题"),
                new Title("4.jpg","国产独立游戏之光","查看专题"),
                new Title("5.jpg","Android技巧指南","查看专题"),
                new Title("6.jpg","GIF还能这么玩","查看专题"),
                new Title("1.jpg","玩转二维码","查看专题"),
                new Title("2.jpg","Windows美化手册","查看专题"),
                new Title("3.jpg","护眼小技巧","查看专题"),
        };
        List<Title> titleList = Arrays.asList(titles);
        return titleList;
    }

    public List<Hot> getHot(){
        Hot[] hots = {
                new Hot("1.jpg","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Hot("5.jpg","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Hot("3.jpg","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。"),
                new Hot("1.jpg","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Hot("5.jpg","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Hot("3.jpg","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。"),
                new Hot("1.jpg","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Hot("5.jpg","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Hot("3.jpg","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。"),
                new Hot("1.jpg","别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1","如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑。"),
                new Hot("5.jpg","工作日让家中电脑不再闲置，其实你可以遥控它做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？"),
                new Hot("3.jpg","告别死板与沉闷，试试这款像素风汇率查询工具：像素汇率 | App+1","支持现实货币与虚拟货币的像素风汇率换算应用，还可以查看汇率走势。"),
        };
        List<Hot> hotList = Arrays.asList(hots);
        return hotList;
    }

    public Avatar getAvatar(){
        Avatar avatar = new Avatar("avatar.jpg","王宁2333");
        return avatar;
    }
}
