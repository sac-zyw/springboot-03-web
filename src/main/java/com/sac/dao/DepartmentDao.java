package com.sac.dao;

import com.sac.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {
    //模拟数据库中的数据
    private static Map<Integer, Department> departmentMap = null;

    static {
        departmentMap = new HashMap<Integer, Department>();//创建一个部门表
        departmentMap.put(101, new Department(101, "教育部"));
        departmentMap.put(102, new Department(102, "组织部"));
        departmentMap.put(103, new Department(103, "宣传部"));
        departmentMap.put(104, new Department(104, "文艺部"));
        departmentMap.put(105, new Department(105, "广播部"));
    }

    //获得所有部门信息
    public Collection<Department> getDepartments() {
        return departmentMap.values();
    }

    //通过id得到部门
    public Department getDepartmentById(Integer id) {
        return departmentMap.get(id);
    }
}
