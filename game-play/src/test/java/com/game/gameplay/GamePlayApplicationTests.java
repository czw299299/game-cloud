package com.game.gameplay;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.game.gameplay.mapper.AdminMapper;
import com.game.gameplay.pojo.AdminInf;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class GamePlayApplicationTests {

    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void selectList() {
        List<AdminInf> list  = adminMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void addAdmin() {
        AdminInf adminInf = new AdminInf();
        adminInf.setAdminAccount(12345+"");
        adminInf.setAdminPwd(123456789+"");
        int result = adminMapper.insert(adminInf);
        System.out.println(result);
        System.out.println(adminInf);
    }
    @Test
    public void updateAdmin() {
        AdminInf adminInf = new AdminInf();
        adminInf.setAdminAccount(12345+"");
        adminInf.setAdminPwd(123456789+"");
        adminInf.setAdminId(2L);
        int i = adminMapper.updateById(adminInf);
        System.out.println(i);
        System.out.println(adminInf);
    }

    @Test
    public void selectById() {
        AdminInf adminInf = adminMapper.selectById(2L);
        System.out.println(adminInf);
    }

    @Test
    public void selectByBatchId() {
        List<AdminInf> adminInf = adminMapper.selectBatchIds(Arrays.asList(1, 2,3,4));
        adminInf.forEach(System.out::println);
    }

    @Test
    public void selectByPage() {
//        参数1，当前页，参数2，每页的数量
        Page<AdminInf> adminInfPage = new Page<>(1,5);
        adminMapper.selectPage(adminInfPage,null);
        System.out.println(adminInfPage.getTotal());//总条数
        adminInfPage.getRecords().forEach(System.out::println);
    }

    @Test
    public void deleteById() {
        adminMapper.deleteById(2);
    }

    @Test
    void contextLoads(){
        //查询角色id为5。
        QueryWrapper<AdminInf> queryWrapper = new QueryWrapper<>();
//        queryWrapper
//                .between("admin_ctime","2023-03-14","2023-03-15");
//                .isNotNull("name")姓名字段不为空
//                .like("admin_account","1234");
//                .eq("admin_id",5);
//                .likeRight("admin_account","1234")     1234%
//                .likeLeft("admin_account","1234")      %1234
//                .notLike("admin_account","1234")      not like %1234%
//                .inSql("admin_id","select admin_id from admin_inf where admin_id<3");
//        .orderByAsc("admin_ctime")   正序
//        .orderByDesc("admin_ctime")    倒序

//        WHERE admin_status=1 AND (admin_id IN (select admin_id from admin_inf where admin_id<3))


//                .ge("admin_ctime","2023-03-14");//创建日期大于 2023-03-14  ge 大于  ne小于
        adminMapper.selectList(queryWrapper).forEach(System.out::println);

    }

}
