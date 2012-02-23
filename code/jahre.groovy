Number.metaClass {
  use(TimeCategory) { // *.years. *.days, *.months ...
    getJahre { delegate.years } // 10.jahre = 10.years
    getJahr { delegate.jahre }  // 1.jahr = 1.years
  }
}