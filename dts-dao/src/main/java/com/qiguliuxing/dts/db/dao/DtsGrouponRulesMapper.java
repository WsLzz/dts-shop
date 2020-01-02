package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsGrouponRules;
import com.qiguliuxing.dts.db.domain.DtsGrouponRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsGrouponRulesMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	long countByExample(DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int deleteByExample(DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int insert(DtsGrouponRules record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int insertSelective(DtsGrouponRules record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGrouponRules selectOneByExample(DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGrouponRules selectOneByExampleSelective(@Param("example") DtsGrouponRulesExample example,
			@Param("selective") DtsGrouponRules.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	List<DtsGrouponRules> selectByExampleSelective(@Param("example") DtsGrouponRulesExample example,
			@Param("selective") DtsGrouponRules.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	List<DtsGrouponRules> selectByExample(DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGrouponRules selectByPrimaryKeySelective(@Param("id") Integer id,
			@Param("selective") DtsGrouponRules.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	DtsGrouponRules selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsGrouponRules selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id,
			@Param("andLogicalDeleted") boolean andLogicalDeleted);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") DtsGrouponRules record,
			@Param("example") DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") DtsGrouponRules record, @Param("example") DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(DtsGrouponRules record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(DtsGrouponRules record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByExample(@Param("example") DtsGrouponRulesExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_groupon_rules
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByPrimaryKey(Integer id);
}