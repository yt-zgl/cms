package com.soarcms.cms.dao.main;

import com.soarcms.common.hibernate3.Updater;
import com.soarcms.common.page.Pagination;
import com.soarcms.cms.entity.main.CmsThirdAccount;

public interface CmsThirdAccountDao {
	public Pagination getPage(String username,String source,int pageNo, int pageSize);

	public CmsThirdAccount findById(Long id);
	
	public CmsThirdAccount findByKey(String key);

	public CmsThirdAccount save(CmsThirdAccount bean);

	public CmsThirdAccount updateByUpdater(Updater<CmsThirdAccount> updater);

	public CmsThirdAccount deleteById(Long id);
}