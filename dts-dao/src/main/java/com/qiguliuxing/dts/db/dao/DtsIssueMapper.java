package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsIssue;
import com.qiguliuxing.dts.db.domain.DtsIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsIssueMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	long countByExample(DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int deleteByExample(DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int insert(DtsIssue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int insertSelective(DtsIssue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsIssue selectOneByExample(DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsIssue selectOneByExampleSelective(@Param("example") DtsIssueExample example,
			@Param("selective") DtsIssue.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	List<DtsIssue> selectByExampleSelective(@Param("example") DtsIssueExample example,
			@Param("selective") DtsIssue.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	List<DtsIssue> selectByExample(DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsIssue selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsIssue.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	DtsIssue selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsIssue selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id,
			@Param("andLogicalDeleted") boolean andLogicalDeleted);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") DtsIssue record, @Param("example") DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") DtsIssue record, @Param("example") DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(DtsIssue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(DtsIssue record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByExample(@Param("example") DtsIssueExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_issue
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByPrimaryKey(Integer id);
}