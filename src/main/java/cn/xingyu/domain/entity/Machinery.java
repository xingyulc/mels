package cn.xingyu.domain.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.IdentityDialect;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.math.BigDecimal;

@Data
public class Machinery {
    @Id
    @KeySql(useGeneratedKeys = true,dialect=IdentityDialect.MYSQL)
    @GeneratedValue(generator = "JDBC")
  private Long id;
  private String no;
  private String model;
  private String brand;
  private Long machineryId;
  private BigDecimal purchasingPrice;
@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  private Date purchasingDate;
  private Long state;
  private String description;


}
