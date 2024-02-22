package com.lemonzuo.license.service;

import com.lemonzuo.license.vo.License;

/**
 * @author LemonZuo
 * @create 2024-02-22 11:09
 */
public interface JetbrainsService {
    /**
     * 生成license
     * @return License
     */
    License generateLicense(String licenseeName) throws Exception;
}