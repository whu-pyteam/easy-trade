package com.pyteam.db;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

/**
 * @author tyc
 * @date 2019/7/11 20:49
 */
public class RepositoryAnnotationPlugin extends PluginAdapter
{

    @Override
    public boolean validate(List<String> warnings)
    {
        return true;
    }

    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass, IntrospectedTable introspectedTable)
    {
        if(introspectedTable.getTargetRuntime() == IntrospectedTable.TargetRuntime.MYBATIS3)
        {
            // don't need to do this for MYBATIS3_DSQL as that runtime already adds this annotation
            interfaze.addImportedType(
                    new FullyQualifiedJavaType("org.springframework.stereotype.Repository")); //$NON-NLS-1$
            interfaze.addAnnotation("@Repository"); //$NON-NLS-1$
        }
        return true;
    }

}
