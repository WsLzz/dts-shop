package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsSearchHistory;
import com.qiguliuxing.dts.db.domain.DtsSearchHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsSearchHistoryMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	long countByExample(DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int deleteByExample(DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int insert(DtsSearchHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int insertSelective(DtsSearchHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsSearchHistory selectOneByExample(DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsSearchHistory selectOneByExampleSelective(@Param("example") DtsSearchHistoryExample example,
			@Param("selective") DtsSearchHistory.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	List<DtsSearchHistory> selectByExampleSelective(@Param("example") DtsSearchHistoryExample example,
			@Param("selective") DtsSearchHistory.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	List<DtsSearchHistory> selectByExample(DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsSearchHistory selectByPrimaryKeySelective(@Param("id") Integer id,
			@Param("selective") DtsSearchHistory.Column... selective);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	DtsSearchHistory selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	DtsSearchHistory selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id,
			@Param("andLogicalDeleted") boolean andLogicalDeleted);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") DtsSearchHistory record,
			@Param("example") DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") DtsSearchHistory record, @Param("example") DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(DtsSearchHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(DtsSearchHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByExample(@Param("example") DtsSearchHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to
	 * the database table dts_search_history
	 *
	 * @mbg.generated
	 * @project https://github.com/itfsw/mybatis-generator-plugin
	 */
	int logicalDeleteByPrimaryKey(Integer id);
}