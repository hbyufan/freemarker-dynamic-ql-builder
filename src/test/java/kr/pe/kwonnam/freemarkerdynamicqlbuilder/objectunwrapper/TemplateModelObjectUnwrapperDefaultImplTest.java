package kr.pe.kwonnam.freemarkerdynamicqlbuilder.objectunwrapper;

import freemarker.template.Configuration;

public class TemplateModelObjectUnwrapperDefaultImplTest extends AbstractTemplateModelObjectUnwrapperTest {

    @Override
    protected TemplateModelObjectUnwrapper populateUnwrapper(Configuration configuration) {
        return new TemplateModelObjectUnwrapperDefaultImpl();
    }
}