package com.entity.view;

import com.entity.XunwuqishiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 寻物启事留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xunwuqishi_liuyan")
public class XunwuqishiLiuyanView extends XunwuqishiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xunwuqishi
			/**
			* 物品名称
			*/
			private String xunwuqishiName;
			/**
			* 物品类型
			*/
			private Integer shiwuzhaolingTypes;
				/**
				* 物品类型的值
				*/
				private String shiwuzhaolingValue;
			/**
			* 物品状态
			*/
			private Integer statusTypes;
				/**
				* 物品状态的值
				*/
				private String statusValue;
			/**
			* 物品图片
			*/
			private String xunwuqishiPhoto;
			/**
			* 丢失时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date xunwuqishiTime;
			/**
			* 丢失地址
			*/
			private String xunwuqishiDizhi;
			/**
			* 详情
			*/
			private String xunwuqishiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public XunwuqishiLiuyanView() {

	}

	public XunwuqishiLiuyanView(XunwuqishiLiuyanEntity xunwuqishiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, xunwuqishiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set xunwuqishi
					/**
					* 获取： 物品名称
					*/
					public String getXunwuqishiName() {
						return xunwuqishiName;
					}
					/**
					* 设置： 物品名称
					*/
					public void setXunwuqishiName(String xunwuqishiName) {
						this.xunwuqishiName = xunwuqishiName;
					}
					/**
					* 获取： 物品类型
					*/
					public Integer getShiwuzhaolingTypes() {
						return shiwuzhaolingTypes;
					}
					/**
					* 设置： 物品类型
					*/
					public void setShiwuzhaolingTypes(Integer shiwuzhaolingTypes) {
						this.shiwuzhaolingTypes = shiwuzhaolingTypes;
					}


						/**
						* 获取： 物品类型的值
						*/
						public String getShiwuzhaolingValue() {
							return shiwuzhaolingValue;
						}
						/**
						* 设置： 物品类型的值
						*/
						public void setShiwuzhaolingValue(String shiwuzhaolingValue) {
							this.shiwuzhaolingValue = shiwuzhaolingValue;
						}
					/**
					* 获取： 物品状态
					*/
					public Integer getStatusTypes() {
						return statusTypes;
					}
					/**
					* 设置： 物品状态
					*/
					public void setStatusTypes(Integer statusTypes) {
						this.statusTypes = statusTypes;
					}


						/**
						* 获取： 物品状态的值
						*/
						public String getStatusValue() {
							return statusValue;
						}
						/**
						* 设置： 物品状态的值
						*/
						public void setStatusValue(String statusValue) {
							this.statusValue = statusValue;
						}
					/**
					* 获取： 物品图片
					*/
					public String getXunwuqishiPhoto() {
						return xunwuqishiPhoto;
					}
					/**
					* 设置： 物品图片
					*/
					public void setXunwuqishiPhoto(String xunwuqishiPhoto) {
						this.xunwuqishiPhoto = xunwuqishiPhoto;
					}
					/**
					* 获取： 丢失时间
					*/
					public Date getXunwuqishiTime() {
						return xunwuqishiTime;
					}
					/**
					* 设置： 丢失时间
					*/
					public void setXunwuqishiTime(Date xunwuqishiTime) {
						this.xunwuqishiTime = xunwuqishiTime;
					}
					/**
					* 获取： 丢失地址
					*/
					public String getXunwuqishiDizhi() {
						return xunwuqishiDizhi;
					}
					/**
					* 设置： 丢失地址
					*/
					public void setXunwuqishiDizhi(String xunwuqishiDizhi) {
						this.xunwuqishiDizhi = xunwuqishiDizhi;
					}
					/**
					* 获取： 详情
					*/
					public String getXunwuqishiContent() {
						return xunwuqishiContent;
					}
					/**
					* 设置： 详情
					*/
					public void setXunwuqishiContent(String xunwuqishiContent) {
						this.xunwuqishiContent = xunwuqishiContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
