package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsGroupon;
import com.qiguliuxing.dts.db.domain.DtsGrouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsGrouponMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	long countByExample(DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int deleteByExample(DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int insert(DtsGroupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int insertSelective(DtsGroupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGroupon selectOneByExample(DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGroupon selectOneByExampleSelective(@Param("example") DtsGrouponExample example,
			@Param("selective") DtsGroupon.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	List<DtsGroupon> selectByExampleSelective(@Param("example") DtsGrouponExample example,
			@Param("selective") DtsGroupon.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	List<DtsGroupon> selectByExample(DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGroupon selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsGroupon.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	DtsGroupon selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGroupon selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id,
			@Param("andLogicalDeleted") boolean andLogicalDeleted);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") DtsGroupon record, @Param("example") DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") DtsGroupon record, @Param("example") DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(DtsGroupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(DtsGroupon record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByExample(@Param("example") DtsGrouponExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByPrimaryKey(Integer id);
}