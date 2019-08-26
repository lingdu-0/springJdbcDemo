package com.wb.dao;

import com.wb.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public void addUser() {
        jdbcTemplate.execute("insert into t_user (uname,upwd,isAdmin) values ('卢本伟','nb',0)");
    }

    public void deleteUser() {
        jdbcTemplate.execute("delete from current_user where uname='卢本伟'");
    }

    public void updateUser(String name, String number) {
        String sql = "update t_user set number="+number+" where uname='"+name+"'";
        //Object[] args = {number,name};
        jdbcTemplate.update(sql);
    }

    public List<User> findAll() {
        return jdbcTemplate.query("select * from t_user", new RowMapper<User>() {
            public User mapRow(ResultSet rs, int i) throws SQLException {
                User user = new User();
                user.setUid(rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setUpwd(rs.getString("upwd"));
                user.setIdAdmin(rs.getInt("isAdmin"));
                return user;
            }
        });
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
