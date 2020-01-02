package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsPermission;
import com.qiguliuxing.dts.db.domain.DtsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsPermissionMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	long countByExample(DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int deleteByExample(DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int insert(DtsPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int insertSelective(DtsPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsPermission selectOneByExample(DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsPermission selectOneByExampleSelective(@Param("example") DtsPermissionExample example,
			@Param("selective") DtsPermission.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	List<DtsPermission> selectByExampleSelective(@Param("example") DtsPermissionExample example,
			@Param("selective") DtsPermission.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	List<DtsPermission> selectByExample(DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsPermission selectByPrimaryKeySelective(@Param("id") Integer id,
			@Param("selective") DtsPermission.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	DtsPermission selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsPermission selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id,
			@Param("andLogicalDeleted") boolean andLogicalDeleted);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") DtsPermission record, @Param("example") DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") DtsPermission record, @Param("example") DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(DtsPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(DtsPermission record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByExample(@Param("example") DtsPermissionExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_permission
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByPrimaryKey(Integer id);
}