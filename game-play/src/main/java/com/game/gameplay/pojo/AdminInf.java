package com.game.gameplay.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminInf {
    private int roleId;
    //主键默认为ASSING_ID使用的是雪花算法。全集唯一ID。如果要设置自增 则改为AUTO.
    @TableId(type= IdType.ASSIGN_ID)
    private Long adminId;
    //    private UUID uuid;
    private String adminAccount;
    private String adminPwd;
    private String adminCtime;
    @TableLogic
    private int adminStatus;
    private String adminUtime;
}