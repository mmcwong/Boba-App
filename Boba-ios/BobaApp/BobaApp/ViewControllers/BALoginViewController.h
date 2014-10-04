//
//  BALoginViewController.h
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface BALoginViewController : UIViewController

@property (weak, nonatomic) IBOutlet UITextField *usernameField;
@property (weak, nonatomic) IBOutlet UITextField *passwordField;
@property (weak, nonatomic) IBOutlet UIButton *loginButton;
@property (weak, nonatomic) IBOutlet UIButton *loginWithFacebook;
@property (weak, nonatomic) IBOutlet UIButton *loginWithGoogle;

- (IBAction)loginButtonPressed:(id)sender;
- (IBAction)loginWithFacebookPressed:(id)sender;
- (IBAction)loginWithGooglePressed:(id)sender;

@end
