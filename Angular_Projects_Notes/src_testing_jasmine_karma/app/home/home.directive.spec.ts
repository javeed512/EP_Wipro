import { HomeDirective } from './home.directive';

describe('HomeDirective', () => {
  it('should create an instance', () => {
    const directive = new HomeDirective();
    expect(directive).toBeTruthy();
  });

  it('is valid test',()=>{
    const directive = new HomeDirective();

      expect(directive.isValid()).toBeTrue();
  })




});
