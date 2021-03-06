package cn.xingyu.domain.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;
import java.math.BigDecimal;

@Data
public class ProjectCost {
    @Id
    @KeySql(useGeneratedKeys = true,dialect=IdentityDialect.MYSQL)
    @GeneratedValue(generator = "JDBC")
  private Long id;
  private String no;
  private Long projectId;
  private Long machineryId;
  private Long type;
  private BigDecimal cost;
  private Date costDate;
  private String agent;
  private String remark;


}
