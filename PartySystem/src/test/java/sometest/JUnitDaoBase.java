package sometest;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class JUnitDaoBase extends AbstractTransactionalJUnit4SpringContextTests{
	@Override
	@Resource(name="dataSource")
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
}
