package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsUserAccount;
import com.qiguliuxing.dts.db.domain.DtsUserAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsUserAccountMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	long countByExample(DtsUserAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int deleteByExample(DtsUserAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int insert(DtsUserAccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int insertSelective(DtsUserAccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsUserAccount selectOneByExample(DtsUserAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsUserAccount selectOneByExampleSelective(@Param("example") DtsUserAccountExample example,
			@Param("selective") DtsUserAccount.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	List<DtsUserAccount> selectByExampleSelective(@Param("example") DtsUserAccountExample example,
			@Param("selective") DtsUserAccount.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	List<DtsUserAccount> selectByExample(DtsUserAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsUserAccount selectByPrimaryKeySelective(@Param("id") Integer id,
			@Param("selective") DtsUserAccount.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	DtsUserAccount selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") DtsUserAccount record,
			@Param("example") DtsUserAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") DtsUserAccount record, @Param("example") DtsUserAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(DtsUserAccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_user_account
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(DtsUserAccount record);
}