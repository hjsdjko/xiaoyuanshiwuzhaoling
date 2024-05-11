package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 寻物启事
 *
 * @author 
 * @email
 */
@TableName("xunwuqishi")
public class XunwuqishiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XunwuqishiEntity() {

	}

	public XunwuqishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 物品名称
     */
    @TableField(value = "xunwuqishi_name")

    private String xunwuqishiName;


    /**
     * 物品类型
     */
    @TableField(value = "shiwuzhaoling_types")

    private Integer shiwuzhaolingTypes;


    /**
     * 物品状态
     */
    @TableField(value = "status_types")

    private Integer statusTypes;


    /**
     * 物品图片
     */
    @TableField(value = "xunwuqishi_photo")

    private String xunwuqishiPhoto;


    /**
     * 丢失时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "xunwuqishi_time")

    private Date xunwuqishiTime;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 丢失地址
     */
    @TableField(value = "xunwuqishi_dizhi")

    private String xunwuqishiDizhi;


    /**
     * 详情
     */
    @TableField(value = "xunwuqishi_content")

    private String xunwuqishiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：物品名称
	 */
    public String getXunwuqishiName() {
        return xunwuqishiName;
    }


    /**
	 * 获取：物品名称
	 */

    public void setXunwuqishiName(String xunwuqishiName) {
        this.xunwuqishiName = xunwuqishiName;
    }
    /**
	 * 设置：物品类型
	 */
    public Integer getShiwuzhaolingTypes() {
        return shiwuzhaolingTypes;
    }


    /**
	 * 获取：物品类型
	 */

    public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
        this.shiwuzhaolingTypes = shiwuzhaolingTypes;
    }
    /**
	 * 设置：物品状态
	 */
    public Integer getStatusTypes() {
        return statusTypes;
    }


    /**
	 * 获取：物品状态
	 */

    public void setStatusTypes(Integer statusTypes) {
        this.statusTypes = statusTypes;
    }
    /**
	 * 设置：物品图片
	 */
    public String getXunwuqishiPhoto() {
        return xunwuqishiPhoto;
    }


    /**
	 * 获取：物品图片
	 */

    public void setXunwuqishiPhoto(String xunwuqishiPhoto) {
        this.xunwuqishiPhoto = xunwuqishiPhoto;
    }
    /**
	 * 设置：丢失时间
	 */
    public Date getXunwuqishiTime() {
        return xunwuqishiTime;
    }


    /**
	 * 获取：丢失时间
	 */

    public void setXunwuqishiTime(Date xunwuqishiTime) {
        this.xunwuqishiTime = xunwuqishiTime;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：丢失地址
	 */
    public String getXunwuqishiDizhi() {
        return xunwuqishiDizhi;
    }


    /**
	 * 获取：丢失地址
	 */

    public void setXunwuqishiDizhi(String xunwuqishiDizhi) {
        this.xunwuqishiDizhi = xunwuqishiDizhi;
    }
    /**
	 * 设置：详情
	 */
    public String getXunwuqishiContent() {
        return xunwuqishiContent;
    }


    /**
	 * 获取：详情
	 */

    public void setXunwuqishiContent(String xunwuqishiContent) {
        this.xunwuqishiContent = xunwuqishiContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xunwuqishi{" +
            "id=" + id +
            ", xunwuqishiName=" + xunwuqishiName +
            ", shiwuzhaolingTypes=" + shiwuzhaolingTypes +
            ", statusTypes=" + statusTypes +
            ", xunwuqishiPhoto=" + xunwuqishiPhoto +
            ", xunwuqishiTime=" + xunwuqishiTime +
            ", yonghuId=" + yonghuId +
            ", xunwuqishiDizhi=" + xunwuqishiDizhi +
            ", xunwuqishiContent=" + xunwuqishiContent +
            ", createTime=" + createTime +
        "}";
    }
}
