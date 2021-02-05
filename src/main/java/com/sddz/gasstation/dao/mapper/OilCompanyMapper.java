package com.sddz.gasstation.dao.mapper;

import com.sddz.gasstation.entity.PC.OilCompany;

import java.util.List;

public interface OilCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oil_company
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oil_company
     *
     * @mbg.generated
     */
    int insert(OilCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oil_company
     *
     * @mbg.generated
     */
    int insertSelective(OilCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oil_company
     *
     * @mbg.generated
     */
    OilCompany selectByPrimaryKey(Long id);
    List<OilCompany> selectByCondition(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oil_company
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OilCompany record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oil_company
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OilCompany record);
}
